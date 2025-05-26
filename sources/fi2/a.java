package fi2;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62221i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f62222j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(0);
        this.f62221i = i13;
        this.f62222j = bVar;
    }

    public final File b() {
        int i13 = this.f62221i;
        b bVar = this.f62222j;
        switch (i13) {
            case 0:
                return bVar.f62223a.getCacheDir();
            default:
                bVar.getClass();
                File file = new File(bVar.f62223a.getFilesDir(), "embrace");
                File file2 = null;
                try {
                    file.mkdirs();
                    if (!file.exists()) {
                        file = null;
                    }
                    file2 = file;
                } catch (SecurityException unused) {
                }
                if (file2 != null) {
                    return file2;
                }
                Object value = bVar.f62226d.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-cacheDirectory>(...)");
                return (File) value;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f62221i) {
        }
        return b();
    }
}
