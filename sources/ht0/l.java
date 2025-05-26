package ht0;

import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import u50.f0;
import u50.k0;

/* loaded from: classes5.dex */
public final class l extends xa.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f70119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f70120b;

    public l(m mVar, ArrayList arrayList) {
        this.f70119a = mVar;
        this.f70120b = arrayList;
    }

    @Override // xa.k, xa.i
    public final void A5(int i13) {
        us0.d dVar = this.f70119a.f70129y0;
        if (dVar != null) {
            dVar.r3(i13, f1.SWIPE);
        }
    }

    @Override // xa.k, xa.i
    public final void i(int i13, float f13, int i14) {
        v vVar = (v) this.f70120b.get(i13);
        GestaltText gestaltText = this.f70119a.f70128x0;
        if (gestaltText == null) {
            Intrinsics.r("tabDescription");
            throw null;
        }
        int i15 = vVar.f70142c;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        ArrayList arrayList = new ArrayList(formatArgs.length);
        for (String str : formatArgs) {
            arrayList.add(new f0(str));
        }
        a0.q(gestaltText, new k0(i15, arrayList));
    }
}
