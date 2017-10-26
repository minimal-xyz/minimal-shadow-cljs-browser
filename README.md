
Browser demo for [shadow-cljs](https://github.com/thheller/shadow-cljs)
----

### Usage

```bash
npm install -g shadow-cljs
```

Run in developmeent:

```bash
yarn
yarn shadow-cljs watch app
# another tty
yarn serve # web server on localhost:8080
```

When watch server and the page is up, you may also start a REPL connected to browser with:

```bash
yarn shadow-cljs cljs-repl app
```

Compile with optimizations:

```bash
yarn shadow-cljs release app
yarn html
yarn serve # web server on localhost:8080
```

### License

MIT
