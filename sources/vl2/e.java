package vl2;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f126170j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f126171k = new e(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126172i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f126172i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String obj2;
        switch (this.f126172i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    obj2 = Arrays.toString((boolean[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                } else if (value instanceof char[]) {
                    obj2 = Arrays.toString((char[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                } else if (value instanceof byte[]) {
                    obj2 = Arrays.toString((byte[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                } else if (value instanceof short[]) {
                    obj2 = Arrays.toString((short[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                } else if (value instanceof int[]) {
                    obj2 = Arrays.toString((int[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                } else if (value instanceof float[]) {
                    obj2 = Arrays.toString((float[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                } else if (value instanceof long[]) {
                    obj2 = Arrays.toString((long[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                } else if (value instanceof double[]) {
                    obj2 = Arrays.toString((double[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                } else if (value instanceof Object[]) {
                    obj2 = Arrays.toString((Object[]) value);
                    Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                } else {
                    obj2 = value.toString();
                }
                return str + '=' + obj2;
            default:
                am2.g makeKotlinParameterTypes = (am2.g) obj;
                Intrinsics.checkNotNullParameter(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
                return Boolean.valueOf(bn2.i.e(makeKotlinParameterTypes));
        }
    }
}
