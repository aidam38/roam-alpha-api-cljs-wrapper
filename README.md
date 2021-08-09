# Roam Alpha API ClojureScript wrapper

## Installation

Include `[org.clojars.aidam/roam-alpha-api "1.0.2"]]` in your project.

## Usage

The namespaces mirror the structure of the roamAlphaAPI JS object.

All inputs and outputs are in cljs instead of js (i.e. you don't need to do any converting).

## Example

```clojure
(ns roam-plugin.core
  [:require [roam-alpha-api.data :as d]
            [roam-alpha-api.data.block :as block]
            [roam-alpha-api.ui :refer [get-focused-block]]
            [roam-alpha-api.util :refer [generate-uid]]])

(d/q '[:find ... :where ...])
(block/create {:block {:uid "..."}})
(get-focused-block)
(generate-uid)
```

## License

Copyright © 2021

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
