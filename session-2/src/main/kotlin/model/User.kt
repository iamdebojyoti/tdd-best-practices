package model

data class User(val role: Role, val accessibleStore: List<Int>)

enum class Role {
    ASSISTANT, OWNER, ADMIN
}