package tu0;

import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.feature.ideaPinCreation.education.IdeaPinCreationEducationOnboardingView;
import kotlin.jvm.internal.h0;
import rg0.n;
import xk2.v;

/* loaded from: classes5.dex */
public final class e implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f119326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f119327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IdeaPinCreationEducationOnboardingView f119328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f119329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f119330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h0 f119331f;

    public e(FrameLayout frameLayout, n nVar, IdeaPinCreationEducationOnboardingView ideaPinCreationEducationOnboardingView, String str, int i13, h0 h0Var) {
        this.f119326a = frameLayout;
        this.f119327b = nVar;
        this.f119328c = ideaPinCreationEducationOnboardingView;
        this.f119329d = str;
        this.f119330e = i13;
        this.f119331f = h0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        View view2 = this.f119326a;
        view2.removeOnLayoutChangeListener(this);
        n nVar = this.f119327b;
        if (nVar != null) {
            nVar.g();
        }
        int i24 = this.f119331f.f80426a;
        v vVar = IdeaPinCreationEducationOnboardingView.f46525h;
        IdeaPinCreationEducationOnboardingView ideaPinCreationEducationOnboardingView = this.f119328c;
        ideaPinCreationEducationOnboardingView.getClass();
        ideaPinCreationEducationOnboardingView.f46532f.add(new d(this.f119330e, i24, view2, this.f119329d));
        ideaPinCreationEducationOnboardingView.invalidate();
    }
}
