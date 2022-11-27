import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Estoy en el metodo SAVE de CocheCRUDImpl");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Estoy en el metodo FINDALL de CocheCRUDImpl");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Estoy en el metodo DELETE de CocheCRUDImpl");
    }
}
