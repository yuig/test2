package yk1;

/* loaded from: classes5.dex */
public abstract class l extends jc0.b {
    private m presenter;

    public abstract m createPresenter();

    public m getPresenter() {
        return this.presenter;
    }

    public abstract n getView();

    @Override // jc0.a0
    public void onAboutToDismiss() {
        m mVar = this.presenter;
        if (mVar != null) {
            mVar.deactivate();
            mVar.unbind();
        }
    }

    @Override // jc0.a0
    public void onAboutToShow() {
        m mVar = this.presenter;
        if (mVar != null) {
            mVar.activate();
        }
    }

    @Override // jc0.a0
    public void onModalContentContainerCreated() {
        m createPresenter = createPresenter();
        createPresenter.bind(getView());
        this.presenter = createPresenter;
    }
}
