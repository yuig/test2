package sm2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f113274a;

    /* renamed from: b, reason: collision with root package name */
    public final xm2.g f113275b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f113276c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f113277d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f113278e;

    /* renamed from: f, reason: collision with root package name */
    public final String f113279f;

    /* renamed from: g, reason: collision with root package name */
    public final int f113280g;

    public c(b kind, xm2.g metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i13) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f113274a = kind;
        this.f113275b = metadataVersion;
        this.f113276c = strArr;
        this.f113277d = strArr2;
        this.f113278e = strArr3;
        this.f113279f = str;
        this.f113280g = i13;
    }

    public final String toString() {
        return this.f113274a + " version=" + this.f113275b;
    }
}
