package fauzi.hilmy.ufcfighter.Base;

public interface BasePresenter<T extends BaseView> {
    void onAttach(T v);
    void onDetach();
}
