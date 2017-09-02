# src-dep-auto-plugin-example

Example of how to use SBT's `AutoPlugin`s as source dependencies.

Showcases how to make plugin provide compiler plugins, SBT plugins & other project settings to the dependent projects.

```bash
> tree

├── a # first user of the plugin
│   ├── build.sbt
│   ├── project
│   │   ├── build.properties
│   │   ├── plugins.sbt # how to include source-dep plugin
│   └── src
        ...
# demo of usage of plugin-provided lib dependencies, SBT plugins & compiler plugins
        └── ErrA.scala
├── b # second user of the plugin
│   ├── build.sbt
│   ├── project
│   │   ├── build.properties
│   │   └── plugins.sbt # how to include source-dep plugin
│   └── src
      ...
# demo of usage of plugin-provided lib dependencies, SBT plugins & compiler plugins
      └── ErrB.scala
└── plugin
    ├── build.sbt # how to include sbt plugins to provide to dependents
    ├── project
    │   ├── build.properties
    └── src
        ...
# declares compiler plugins, compiler options & library dependencies
        └── SettingsPlugin.scala

```
