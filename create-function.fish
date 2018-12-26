#!/usr/bin/env fish

set -x REGISTRY gcr.io
set -x REGISTRY_USER (gcloud config get-value core/project)

pfs function create random \
             --git-repo https://github.com/shinyay/pfs-spring-random.git \
             --handler number \
             --image $REGISTRY/$REGISTRY_USER/random \
             --verbose
