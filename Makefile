default: dev

dev:
	lein run

static:
	npm install

grunt: 
	./node_modules/.bin/grunt $

bower:
	./node_modules/.bin/bower install $T


