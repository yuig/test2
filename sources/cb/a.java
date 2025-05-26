package cb;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27260i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f27261j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(0);
        this.f27260i = i13;
        this.f27261j = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f27260i;
        b bVar = this.f27261j;
        switch (i13) {
            case 0:
                Class<?> loadClass = bVar.f27262a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                Class<?> loadClass2 = bVar.f27262a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                Intrinsics.checkNotNullExpressionValue(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                boolean z13 = false;
                Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod("getWindowExtensions", new Class[0]);
                Class<?> clazz = bVar.f27262a.loadClass("androidx.window.extensions.WindowExtensions");
                Intrinsics.checkNotNullExpressionValue(clazz, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Intrinsics.checkNotNullExpressionValue(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                Intrinsics.checkNotNullParameter(getWindowExtensionsMethod, "<this>");
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                if (getWindowExtensionsMethod.getReturnType().equals(clazz)) {
                    Intrinsics.checkNotNullParameter(getWindowExtensionsMethod, "<this>");
                    if (Modifier.isPublic(getWindowExtensionsMethod.getModifiers())) {
                        z13 = true;
                    }
                }
                return Boolean.valueOf(z13);
        }
    }
}
