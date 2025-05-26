package ic1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class p extends v {

    /* renamed from: d, reason: collision with root package name */
    public final int f72083d;

    /* renamed from: e, reason: collision with root package name */
    public final bd1.b f72084e;

    /* renamed from: f, reason: collision with root package name */
    public final String f72085f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f72086g;

    private p(int i13, int i14, int i15, bd1.b bVar, String str, Integer num) {
        super(i13, i14, null, 4, null);
        this.f72083d = i15;
        this.f72084e = bVar;
        this.f72085f = str;
        this.f72086g = num;
    }

    public /* synthetic */ p(int i13, int i14, int i15, bd1.b bVar, String str, Integer num, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, i15, bVar, str, (i16 & 32) != 0 ? null : num, null);
    }

    public /* synthetic */ p(int i13, int i14, int i15, bd1.b bVar, String str, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, i15, bVar, str, num);
    }
}
