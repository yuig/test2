package jo;

import e2.u;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final u f77131a;

    public c(u uVar) {
        this.f77131a = uVar;
    }

    public static void b(ArrayList arrayList) {
        Collections.sort(arrayList, new ho.f((Object) null));
    }

    public abstract ArrayList a(CharSequence charSequence);
}
