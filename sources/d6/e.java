package d6;

import il2.m;
import in2.n;
import java.io.File;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53731i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f53732j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13, Function0 function0) {
        super(0);
        this.f53731i = i13;
        this.f53732j = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f53731i;
        Function0 function0 = this.f53732j;
        switch (i13) {
            case 0:
                File file = (File) function0.invoke();
                if (Intrinsics.d(m.g(file), "preferences_pb")) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 1:
                m127invoke();
                return Unit.f80348a;
            case 2:
                m127invoke();
                return Unit.f80348a;
            case 3:
                m127invoke();
                return Unit.f80348a;
            case 4:
                m127invoke();
                return Unit.f80348a;
            case 5:
                n nVar = (n) function0.invoke();
                return nVar instanceof in2.a ? ((in2.a) nVar).h() : nVar;
            default:
                return CollectionsKt.J0((Iterable) function0.invoke());
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m127invoke() {
        int i13 = this.f53731i;
        Function0 function0 = this.f53732j;
        switch (i13) {
            case 1:
                function0.invoke();
                break;
            case 2:
                function0.invoke();
                break;
            case 3:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
    }
}
