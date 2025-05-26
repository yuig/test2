package o5;

import a7.o0;
import android.text.TextUtils;
import g8.p;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import l9.j;
import pn2.h0;
import q8.k0;
import q8.s;

/* loaded from: classes.dex */
public final class a implements h8.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f92884a;

    /* renamed from: b, reason: collision with root package name */
    public int f92885b;

    /* renamed from: c, reason: collision with root package name */
    public Object f92886c;

    public a(int i13) {
        if (i13 == 1) {
            this.f92886c = new bk.f();
            return;
        }
        this.f92884a = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.f92886c = c.f92892d;
        this.f92885b = 2;
    }

    public final h8.e a(int i13, androidx.media3.common.b bVar, boolean z13, ArrayList arrayList, k0 k0Var) {
        s iVar;
        String str = bVar.f18764n;
        if (!o0.p(str)) {
            if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                iVar = new h9.d(this.f92884a ? 1 : 3, (j) this.f92886c);
            } else if (Objects.equals(str, "image/jpeg")) {
                iVar = new p(1);
            } else if (Objects.equals(str, "image/png")) {
                iVar = new u8.a(1);
            } else {
                int i14 = z13 ? 4 : 0;
                if (!this.f92884a) {
                    i14 |= 32;
                }
                iVar = new j9.i((j) this.f92886c, i14 | j9.i.c(this.f92885b), null, null, arrayList, k0Var);
            }
        } else {
            if (!this.f92884a) {
                return null;
            }
            iVar = new l9.g(((j) this.f92886c).p(bVar), bVar);
        }
        return new h8.e(iVar, i13, bVar);
    }

    public a(h0 h0Var, int i13, boolean z13) {
        this.f92886c = h0Var;
        this.f92885b = i13;
        this.f92884a = z13;
    }
}
