
Browser demo for [shadow-cljs](https://github.com/thheller/shadow-cljs)
----

### Develop

Run in developmeent:

```bash
yarn
(mkdir -p target && cp assets/index.html target/)
yarn shadow-cljs watch app
```

`shadow-cljs` will be installed in `node_modules/` when you run `yarn`.

`:http-root` and `:http-port` configs specify that `target/index.html` will be served at http://localhost:8080 .

### REPL

After page is loaded, you may also start a REPL connected to browser with:

```bash
yarn shadow-cljs cljs-repl app
```

### Release

Compile with optimizations with `release` sub-command:

```bash
yarn shadow-cljs release app
mkdir -p target && cp assets/index.html target/
yarn serve # serving target/ on http://localhost:8080
```

Read docs for more http://doc.shadow-cljs.org/ .

### License

MIT
