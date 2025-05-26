package im1;

import androidx.appcompat.widget.q2;
import com.google.firebase.messaging.q;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class n implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f72672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f72673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f72674c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f72675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f72676e;

    public n(Function1 function1, q qVar, cn1.b bVar, Function1 function12, cn1.b bVar2) {
        this.f72672a = function1;
        this.f72673b = qVar;
        this.f72674c = bVar;
        this.f72675d = function12;
        this.f72676e = bVar2;
    }

    @Override // androidx.appcompat.widget.q2
    public final boolean a(String str) {
        this.f72675d.invoke(str);
        this.f72673b.s((gm1.c) this.f72676e.invoke(str));
        return false;
    }

    @Override // androidx.appcompat.widget.q2
    public final boolean b(String str) {
        this.f72672a.invoke(str);
        this.f72673b.s((gm1.c) this.f72674c.invoke(str));
        return false;
    }
}
