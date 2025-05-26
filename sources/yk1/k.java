package yk1;

import a.cb;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class k extends nl1.d implements r {
    public m X;
    public boolean Y;
    public boolean Z = true;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f139229a0 = true;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f139230b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f139231c0;

    /* renamed from: d0, reason: collision with root package name */
    public GestaltText f139232d0;

    public static q W7() {
        int i13 = at1.d.f20439o;
        at1.d e13 = nl.b.e();
        q qVar = e13.f20446k;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q();
        e13.f20446k = qVar2;
        return qVar2;
    }

    @Override // nl1.d
    public void K7() {
        fo1.a i73;
        if (this.f139232d0 == null && (i73 = i7()) != null) {
            GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i73;
            if (!TextUtils.isEmpty(gestaltToolbarImpl.y())) {
                this.f139232d0 = gestaltToolbarImpl.A();
            }
        }
        super.K7();
        if (!this.f139230b0) {
            this.f139231c0 = true;
            return;
        }
        m mVar = this.X;
        if (mVar != null) {
            mVar.activate();
        }
    }

    @Override // nl1.d
    public void L7() {
        this.f139231c0 = false;
        m mVar = this.X;
        if (mVar != null) {
            mVar.deactivate();
        }
        super.L7();
    }

    public abstract m V7();

    public final void X7() {
        throw new UnsupportedOperationException();
    }

    @Override // nl1.d, cu.d
    public void Y0() {
        P7();
    }

    @Override // nl1.d
    public final View g7() {
        return this.f139232d0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        m mVar = this.X;
        if (mVar != null) {
            mVar.activityResult(i13, i14, intent);
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        m mVar;
        String string;
        super.onCreate(bundle);
        if (bundle == null || (string = bundle.getString("MvpFragment.PresenterBundleKey")) == null) {
            mVar = null;
        } else {
            this.Y = true;
            mVar = W7().a(string);
            if (mVar != null) {
                this.Z = false;
            }
        }
        if (mVar == null) {
            mVar = V7();
            this.Z = true;
        }
        Intrinsics.g(mVar, "null cannot be cast to non-null type com.pinterest.framework.mvp.MvpPresenter<com.pinterest.framework.mvp.MvpView>");
        this.X = mVar;
        if (this.Z) {
            mVar.create();
        } else {
            mVar.restore();
        }
        this.Z = true;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        m mVar;
        if (this.f139229a0 && (mVar = this.X) != null) {
            mVar.destroy();
        }
        this.f139229a0 = true;
        super.onDestroy();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        m mVar = this.X;
        if (mVar != null) {
            mVar.unbind();
        }
        this.f139230b0 = false;
        this.f139232d0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        m presenter = this.X;
        if (this.f139230b0) {
            com.pinterest.framework.screens.s sVar = this.f91293r;
            ScreenDescription screen = this.f76937a;
            if (sVar != null && screen != null) {
                Intrinsics.checkNotNullParameter(screen, "screen");
                ScreenDescription n13 = sVar.n(screen);
                if (n13 != null) {
                    screen = n13;
                }
                Iterator it = CollectionsKt.l0(e0.b(sVar.f49235j), sVar.f49237l).iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        bool = Boolean.FALSE;
                        break;
                    }
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.d(screen, (ScreenDescription) it2.next())) {
                            bool = Boolean.TRUE;
                            break loop0;
                        }
                    }
                }
            } else {
                bool = null;
            }
            if (Intrinsics.d(bool, Boolean.FALSE)) {
                return;
            }
            if (!this.Y) {
                if (presenter != null) {
                    presenter.saveInstanceState(outState);
                    return;
                }
                return;
            }
            W7();
            Intrinsics.checkNotNullParameter(this, "view");
            String key = cb.i(getClass().getName(), q.f139234b.nextInt());
            if (presenter != null) {
                q W7 = W7();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(presenter, "presenter");
                W7.f139235a.put(key, presenter);
            }
            outState.putString("MvpFragment.PresenterBundleKey", key);
            this.f139229a0 = false;
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        m mVar;
        m mVar2;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        if (bundle != null && (mVar2 = this.X) != null) {
            mVar2.restoreInstanceState(bundle);
        }
        m mVar3 = this.X;
        if (mVar3 != null) {
            mVar3.bind(this);
        }
        this.f139230b0 = true;
        if (!this.f139231c0 || (mVar = this.X) == null) {
            return;
        }
        mVar.activate();
    }
}
