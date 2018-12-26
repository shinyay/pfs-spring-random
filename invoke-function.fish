#!/usr/bin/env fish

pfs service invoke random --text -- -w '\n' -d $argv[1]
