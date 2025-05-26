package nb0;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final v f90328j = new v(0);

    /* renamed from: k, reason: collision with root package name */
    public static final v f90329k = new v(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90330i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13) {
        super(0);
        this.f90330i = i13;
    }

    public final File b() {
        switch (this.f90330i) {
            case 0:
                Context context = kb0.a.f79058b;
                return new File(m60.f0.X().getFilesDir(), "datastore/pinterest.persist.preferences_pb");
            default:
                Context context2 = kb0.a.f79058b;
                return new File(m60.f0.X().getFilesDir(), "datastore/pinterest.preferences_pb");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f90330i) {
        }
        return b();
    }
}
