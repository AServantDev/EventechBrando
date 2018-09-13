### GitHub - Travail sur repository commun

- Ajout de collaborateurs au repository

- Les collaborateurs clonent le repository sur leur espace local.

```shell
git clone : lien du repository
 ```
On vérifie que l'on est bien sur la branche develop.

 ```shell
git branch
  ```

On crée une branche Feature 1.

  ```shell
git checkout - b Feature/Feature1
   ```

Si besoin de supprimer la branche :

  ```shell
git branch -d
   ```
   
Pour mettre à jour le repository en local à partir de la branche develop :

  ```shell
git pull origin develop
   ```
