package te0;

import android.graphics.Typeface;
import java.util.LinkedHashMap;
import kh2.a1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends a1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lm1.b f117486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f117487d;

    public f(lm1.b bVar, d dVar) {
        this.f117486c = bVar;
        this.f117487d = dVar;
    }

    @Override // kh2.a1
    public final void l0(int i13) {
        if (i13 == -1 || i13 == 1) {
            LinkedHashMap linkedHashMap = g.f117488a;
            lm1.b fontType = this.f117486c;
            Intrinsics.checkNotNullParameter(fontType, "fontType");
            Typeface typeface = fontType == lm1.c.f83927c ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
            Intrinsics.f(typeface);
            g.f117488a.put(fontType, typeface);
            d dVar = this.f117487d;
            if (dVar != null) {
                dVar.a(typeface);
            }
        }
    }

    @Override // kh2.a1
    public final void m0(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        g.f117488a.put(this.f117486c, typeface);
        d dVar = this.f117487d;
        if (dVar != null) {
            dVar.a(typeface);
        }
    }
}
