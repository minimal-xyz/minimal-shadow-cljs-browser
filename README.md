
Browser demo for [shadow-cljs](https://github.com/thheller/shadow-cljs)
----

### Usage

Run in developmeent:

```bash
yarn
yarn watch
# another tty
yarn serve # web server on localhost:8080
```

Compile with optimizations:

```bash
yarn build # web server on localhost:8080
```

### Scripts:

Here's the related npm scripts:

```js
  "scripts": {
    "watch": "shadow-cljs watch app",
    "compile": "shadow-cljs compile app",
    "release": "shadow-cljs release app",
    "html": "mkdir -p target && cp assets/index.html target/",
    "serve": "yarn html && http-server target/",
    "del": "rm -r target/*",
    "build": "yarn release && yarn html && yarn serve"
  },
```

### License

MIT
