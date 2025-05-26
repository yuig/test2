package hs1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.pinterest.ui.imageview.GenericWebImageView;
import df.j1;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends z {

    /* renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.o f70044i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f70045j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, com.bumptech.glide.o oVar, String str) {
        super(str);
        this.f70045j = mVar;
        this.f70044i = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hs1.z
    public final void a(a aVar) {
        com.bumptech.glide.l d2;
        Drawable drawable;
        if (aVar != 0) {
            String str = this.f70083a;
            if (str != null) {
                Bitmap.Config config = r.f70066d;
                if (str.length() <= 0 || Intrinsics.d("null", str)) {
                    return;
                }
            }
            if (str == null) {
                return;
            }
            aVar.n1(str);
            de.h hVar = new de.h();
            hVar.t(new ge.d(j1.c(str, this.f70084b)));
            hVar.q(wd.m.f129183a, new wd.t(), true);
            List list = this.f70090h;
            if (list != null) {
                wd.d[] dVarArr = (wd.d[]) list.toArray(new wd.d[0]);
            }
            com.bumptech.glide.l lVar = null;
            GenericWebImageView genericWebImageView = aVar instanceof GenericWebImageView ? (GenericWebImageView) aVar : null;
            if (genericWebImageView != null && (drawable = genericWebImageView.getDrawable()) != null) {
                hVar.n(drawable);
            }
            td.t c13 = j1.c(str, this.f70084b);
            com.bumptech.glide.o oVar = this.f70044i;
            if (oVar != null && (d2 = oVar.d()) != null) {
                lVar = d2.K(c13);
            }
            if (lVar != null) {
                lVar.a(hVar);
            }
            m mVar = this.f70045j;
            if (lVar != null) {
                lVar.I(new f(aVar, this, mVar, aVar));
            }
            if (lVar != null) {
                lVar.G((ImageView) aVar);
            }
            mVar.getClass();
            LinkedHashSet linkedHashSet = r.f70070h;
            if (linkedHashSet.contains(str) || !r.f70069g.contains(str)) {
                return;
            }
            linkedHashSet.add(str);
        }
    }
}
