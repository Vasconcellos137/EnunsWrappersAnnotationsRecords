POO - 08.05.26

# Enums

- Representa um conjunto fixo de constantes, tipo especial criado p isso. è tipo uma variavel fixa p guaradar estados ou modos.

- Um enumenum pode, assim como um enum tradicional class, ter atributos e métodos. A única diferença é que as constantes do enum são public` undefined` statice final `undefined` (imutáveis ​​- não podem ser sobrescritas).

- Um objeto enumnão pode ser usado para criar objetos e não pode estender outras classes (mas pode implementar interfaces).

- Por que e quando usar enums?
Use enums quando tiver valores que você sabe que não vão mudar, como dias do mês, dias da semana, cores, baralho de cartas, etc.

# Exemplo:
    public enum StatusPedido {
        ABERTO,
        PAGO,
        ...
}

# Métodos original a Enums

- .values() -> retorna valor d var
- .ordinal() -> retorna pos dentro d var
- .valueOf ( pos ) -> retorna pos que pedir a ele.

- Constantes e nomenclaturas destas -> ideia de padronizar a linguagem, foco em legibilidade do código.

- Variável "final" -> recebe valor uma única vez.

# Tipos Primitivos -> N são necessariamenete necessários, mas se pode trabalhra sem eles. -> WRAPPERS
- int
- char
- boobleam
- float

Iterator -> é um objeto que pode ser usado para percorrer coleções.