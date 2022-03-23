## Requirements

---

* Add new music
* List all music with pagination (first 20)
* List one Music by id
* List musics by lyrics, author, band or category

---

### Entities

* Music 
  * id: UUID 
  * title: String
  * lyrics: String
  * createdAt: Timestamp
  * updateAt: Timestamp
  * enable: Boolean
  * authorsId: UUID
  * categoryId: UUID
  * bandId: UUID
  * userIdCreate: UUID
---
* Author
  * id: UUID
  * name: String
  * createdAt: Timestamp
  * updateAt: Timestamp
---
* Category
  * id: UUID
  * name: String
  * createdAt: Timestamp
  * updateAt: Timestamp
---
* Band
  * id: UUID
  * imageUrl: String
---
* User
  * id: UUID
  * name: String
  * email: String
  * password: String
  * isEnable: Boolean
  * createdAt: Timestamp
  * updateAt: Timestamp