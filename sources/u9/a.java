package u9;

import d7.d0;
import d7.n0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import l9.l;

/* loaded from: classes3.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f121117a = new d0();

    @Override // l9.l
    public final int E() {
        return 2;
    }

    @Override // l9.l
    public final void w(byte[] bArr, int i13, int i14, l9.k kVar, d7.i iVar) {
        c7.b a13;
        d0 d0Var = this.f121117a;
        d0Var.I(i13 + i14, bArr);
        d0Var.K(i13);
        ArrayList arrayList = new ArrayList();
        while (d0Var.a() > 0) {
            bf.b.h("Incomplete Mp4Webvtt Top Level box header found.", d0Var.a() >= 8);
            int k13 = d0Var.k();
            if (d0Var.k() == 1987343459) {
                int i15 = k13 - 8;
                CharSequence charSequence = null;
                c7.a aVar = null;
                while (i15 > 0) {
                    bf.b.h("Incomplete vtt cue box header found.", i15 >= 8);
                    int k14 = d0Var.k();
                    int k15 = d0Var.k();
                    int i16 = k14 - 8;
                    byte[] bArr2 = d0Var.f53806a;
                    int i17 = d0Var.f53807b;
                    int i18 = n0.f53866a;
                    String str = new String(bArr2, i17, i16, StandardCharsets.UTF_8);
                    d0Var.L(i16);
                    i15 = (i15 - 8) - i16;
                    if (k15 == 1937011815) {
                        h hVar = new h();
                        i.e(str, hVar);
                        aVar = hVar.a();
                    } else if (k15 == 1885436268) {
                        charSequence = i.f(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f26657a = charSequence;
                    a13 = aVar.a();
                } else {
                    Pattern pattern = i.f121162a;
                    h hVar2 = new h();
                    hVar2.f121153c = charSequence;
                    a13 = hVar2.a().a();
                }
                arrayList.add(a13);
            } else {
                d0Var.L(k13 - 8);
            }
        }
        iVar.accept(new l9.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
