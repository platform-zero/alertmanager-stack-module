# alertmanager stack module

- Module id: `alertmanager`
- Module repo: `alertmanager-stack-module`
- Source repo: none declared
- Lifecycle: `active`

## Owned overlays
- `stack.compose/alertmanager.yml`
- `stack.config/alertmanager`

## Dependencies
- `prometheus`
- `stack-foundation`

## Validation

```sh
./tests/validate.sh
```

## Lifecycle

`active` modules are expected to keep `stack.module.json`, owned overlays, and `tests/validate.sh` in sync.
