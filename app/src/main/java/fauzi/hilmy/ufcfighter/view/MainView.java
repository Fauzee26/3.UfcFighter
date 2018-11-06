package fauzi.hilmy.ufcfighter.view;

import java.util.List;

import fauzi.hilmy.ufcfighter.Base.BaseView;
import fauzi.hilmy.ufcfighter.model.ResponseFighter;

public interface MainView extends BaseView {
    void onError(String msg);

    void onSuccess(List<ResponseFighter> data);
}