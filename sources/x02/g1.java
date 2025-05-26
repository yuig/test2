package x02;

import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g1 extends dl1.u {

    /* renamed from: d, reason: collision with root package name */
    public final String f131386d;

    /* renamed from: e, reason: collision with root package name */
    public final f30 f131387e;

    /* renamed from: f, reason: collision with root package name */
    public final String f131388f;

    /* renamed from: g, reason: collision with root package name */
    public final String f131389g;

    /* renamed from: h, reason: collision with root package name */
    public final List f131390h;

    /* renamed from: i, reason: collision with root package name */
    public final int f131391i;

    /* renamed from: j, reason: collision with root package name */
    public final String f131392j;

    /* renamed from: k, reason: collision with root package name */
    public final String f131393k;

    /* renamed from: l, reason: collision with root package name */
    public final String f131394l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f131395m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(f30 pin, String str, String str2, int i13, String str3, String str4, String str5, Boolean bool) {
        super("create_no_uid");
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f131386d = "create_no_uid";
        this.f131387e = pin;
        this.f131388f = str;
        this.f131389g = str2;
        this.f131390h = null;
        this.f131391i = i13;
        this.f131392j = str3;
        this.f131393k = str4;
        this.f131394l = str5;
        this.f131395m = bool;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131386d;
    }
}
