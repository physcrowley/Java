package recursion;

class BookStore 
{
    public static Categories cats;
        
    // Définissez une fonction récursive
    public static int countBooks(Categories categories) 
    {
        int books = 0;
        System.out.println();
        for (Category cat : categories) 
        {
            books += cat.numberOfBooks;
            books += countBooks(cat.subCategories);
        }
        return books;
    }
    
    
    public static void main(String[] args) 
    {
        // créer des catégories
        Category c1 = new Category();
        c1.numberOfBooks = 3;
        Category c2 = new Category();
        c2.numberOfBooks = 2;
        Category c3 = new Category();
        c3.numberOfBooks = 10;
        Category c4 = new Category();
        c4.numberOfBooks = 8;
        Category c5 = new Category();
        c5.numberOfBooks = 6;
        Category c6 = new Category();
        c6.numberOfBooks = 1;

        /* organiser les catégories en hiérarchie
            c1
            c2--c3---c5
             |--c4
            c6
        */
        cats = new Categories();
        cats.add(c1);
        cats.add(c2);
        cats.add(c6);

        Categories sub2 = new Categories();
        sub2.add(c3);
        sub2.add(c4);
        c2.subCategories = sub2;

        Categories sub3 = new Categories();
        sub3.add(c5);
        c3.subCategories = sub3;

        // compter les livres
        int nBooks = countBooks(cats);
        int nSub2Books = countBooks(sub2);
        int nSub3Books = countBooks(sub3);
        System.out.println("The bookstore has " + nBooks + " books");
        System.out.println("Category 2 subcategories have " + nSub2Books + " books");
        System.out.println("Category 3 subcategories have " + nSub3Books + " books");
    }
}
