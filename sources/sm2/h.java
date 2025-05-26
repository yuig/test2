package sm2;

import rm2.c0;

/* loaded from: classes4.dex */
public final class h extends d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f113287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f113288c;

    public /* synthetic */ h(c0 c0Var, int i13) {
        this.f113287b = i13;
        this.f113288c = c0Var;
    }

    @Override // sm2.d
    public final void f(String[] strArr) {
        int i13 = this.f113287b;
        c0 c0Var = this.f113288c;
        switch (i13) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                ((g) c0Var).f113286b.f113294d = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                ((g) c0Var).f113286b.f113295e = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((g) c0Var).f113286b.f113298h = strArr;
                return;
        }
    }
}
