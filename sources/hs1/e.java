package hs1;

import android.graphics.Bitmap;
import df.j1;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends z {

    /* renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.o f70038i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f70039j;

    public e(m mVar, com.bumptech.glide.o oVar, File file) {
        this.f70039j = mVar;
        this.f70085c = file;
        this.f70038i = oVar;
    }

    @Override // hs1.z
    public final void a(a aVar) {
        com.bumptech.glide.l c13;
        com.bumptech.glide.l c14;
        if (aVar != null) {
            String str = this.f70083a;
            if (str != null) {
                Bitmap.Config config = r.f70066d;
                if (str.length() <= 0 || Intrinsics.d("null", str)) {
                    return;
                }
            }
            File file = this.f70085c;
            if (file == null || file.exists()) {
                if (file == null && str == null) {
                    return;
                }
                if (this.f70086d) {
                    aVar.y1();
                }
                if (str != null) {
                    aVar.n1(str);
                }
                de.h hVar = new de.h();
                if (str != null) {
                    hVar.t(new ge.d(j1.c(str, this.f70084b)));
                }
                int i13 = this.f70088f;
                if (i13 == 0 && this.f70087e == 0) {
                    int h10 = qb0.b.h();
                    ((de.h) hVar.m(h10, h10)).b();
                } else {
                    hVar.m(this.f70087e, i13);
                    hVar.y(wd.m.f129185c, new wd.g());
                }
                if (this.f70089g) {
                    hVar.b();
                }
                List list = this.f70090h;
                if (list != null) {
                    wd.d[] dVarArr = (wd.d[]) list.toArray(new wd.d[0]);
                    hVar.z((nd.p[]) Arrays.copyOf(dVarArr, dVarArr.length));
                }
                com.bumptech.glide.o oVar = this.f70038i;
                com.bumptech.glide.l lVar = null;
                if (str != null) {
                    td.t c15 = j1.c(str, this.f70084b);
                    if (oVar != null && (c14 = oVar.c()) != null) {
                        lVar = c14.K(c15);
                    }
                } else if (oVar != null && (c13 = oVar.c()) != null) {
                    lVar = c13.K(file);
                }
                if (lVar != null) {
                    lVar.a(hVar);
                }
                if (lVar != null) {
                    m mVar = this.f70039j;
                    lVar.I(new d(aVar, this, mVar, aVar, mVar));
                }
                if (lVar != null) {
                    lVar.H(aVar);
                }
                this.f70039j.getClass();
                if (str != null) {
                    LinkedHashSet linkedHashSet = r.f70070h;
                    if (linkedHashSet.contains(str) || !r.f70069g.contains(str)) {
                        return;
                    }
                    linkedHashSet.add(str);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, com.bumptech.glide.o oVar, String str) {
        super(str);
        this.f70039j = mVar;
        this.f70038i = oVar;
    }
}
