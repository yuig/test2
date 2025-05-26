package db1;

import com.pinterest.api.model.jz;
import dl1.s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class e implements s {

    /* renamed from: a, reason: collision with root package name */
    public final jz f54291a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f54292b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54293c;

    public /* synthetic */ e(jz jzVar, boolean z13, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(jzVar, z13, (i13 & 4) != 0 ? ol2.f.f96454a.toString() : str, null);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getUid() {
        return this.f54293c;
    }

    public /* synthetic */ e(jz jzVar, boolean z13, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(jzVar, z13, str);
    }

    private e(jz jzVar, boolean z13, String str) {
        this.f54291a = jzVar;
        this.f54292b = z13;
        this.f54293c = str;
    }
}
