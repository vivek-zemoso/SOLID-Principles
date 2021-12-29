# Hand-on Training/Practice on SOLID Principles

## OCP (Open-Closed Principle)

As per the principle, in the `DoesNotFollowOCP.java` example, if we want to add `send via voice call` or `send via whatsapp` functionality, then we would have to **modify** an **existing class** which would break the **open-closed principle**

However, in the case of `FollowsOCP.java`, we have extracted all `sending types` into their own respective classes, and *implemented* an `CommunicationOperations` interface on each `sending type class`. This way, even if we add more `sending types`, we can just add new classes of that respective type without *modifying* the existing classes.

## Liskov Substitution Principle

Read this article for more information [LSP](https://www.baeldung.com/java-liskov-substitution-principle)