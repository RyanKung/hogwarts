.PHONY: help

default: dev

help:
	@echo "\033m[1mContact List\033[0m"
	@echo 	
	@echo dev:	 run for dev envirement
	@echo static: 	build static


dev:
	lein run

static: npm bower

npm:
	npm install

bower:
	./nod_modules/.bin/bower install -f

grunt: 
	./node_modules/.bin/grunt $

bower:
	./node_modules/.bin/bower install $T


