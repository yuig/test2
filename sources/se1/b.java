package se1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f112419j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f112420k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f112421l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f112422m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f112423n = new b(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112424i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(0);
        this.f112424i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f112424i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return null;
            default:
                return new a();
        }
    }
}
