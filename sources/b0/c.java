package b0;

import f0.j;
import kotlin.jvm.internal.Intrinsics;
import rp0.d;
import wr0.n;
import wr0.o;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20712a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20713b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20714c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20715d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f20716e;

    /* renamed from: f, reason: collision with root package name */
    public Object f20717f;

    /* renamed from: g, reason: collision with root package name */
    public Object f20718g;

    public c(o onClickUser, n onClickAction, d comment, boolean z13, boolean z14, CharSequence timeStamp, CharSequence timeStampContentDescription) {
        Intrinsics.checkNotNullParameter(onClickUser, "onClickUser");
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        Intrinsics.checkNotNullParameter(timeStampContentDescription, "timeStampContentDescription");
        this.f20715d = onClickUser;
        this.f20712a = onClickAction;
        this.f20716e = comment;
        this.f20713b = z13;
        this.f20714c = z14;
        this.f20717f = timeStamp;
        this.f20718g = timeStampContentDescription;
    }

    public c(v.n nVar, j jVar) {
        this.f20713b = false;
        this.f20714c = false;
        this.f20716e = new Object();
        this.f20717f = new u.a(0);
        this.f20715d = nVar;
        this.f20712a = jVar;
    }
}
