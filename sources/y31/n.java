package y31;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import com.pinterest.gestalt.button.view.GestaltButton;

/* loaded from: classes5.dex */
public final class n implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f136815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c92.n f136816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f136817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f136818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Guideline f136819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GestaltButton f136820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a41.m f136821g;

    public n(q qVar, c92.n nVar, ViewGroup viewGroup, View view, Guideline guideline, GestaltButton gestaltButton, a41.m mVar) {
        this.f136815a = qVar;
        this.f136816b = nVar;
        this.f136817c = viewGroup;
        this.f136818d = view;
        this.f136819e = guideline;
        this.f136820f = gestaltButton;
        this.f136821g = mVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        j41.a aVar;
        view.removeOnLayoutChangeListener(this);
        q qVar = this.f136815a;
        c92.n nVar = this.f136816b;
        j41.b b13 = q.b(qVar, nVar);
        ViewGroup viewGroup = this.f136817c;
        if (b13 == null) {
            b13 = q.a(qVar, nVar, viewGroup);
        }
        this.f136815a.i(b13 != null, this.f136816b, this.f136817c, this.f136818d, this.f136819e, this.f136820f, this.f136821g);
        if (qVar.f136845d) {
            Context context = qVar.f136842a;
            aVar = new j41.a(context.getResources().getDimensionPixelOffset(nz1.a.business_profile_tablet_cover_media_width), context.getResources().getDimensionPixelOffset(nz1.a.business_profile_tablet_cover_media_height));
        } else {
            aVar = new j41.a(viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
        }
        if (b13 != null) {
            b13.a(nVar, aVar);
        }
    }
}
