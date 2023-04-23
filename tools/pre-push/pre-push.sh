#!/bin/bash
echo "Copies pre-push hook to .git folder"
echo 'Copying pre-push hook to your git hooks'
cp tools/pre-push/.githooks/pre-push .git/hooks
chmod +x .git/hooks/pre-push
