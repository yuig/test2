package wn1;

import com.pinterest.gestalt.textcomposer.GestaltTextComposer;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements kl2.m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130563i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTextComposer f130564j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13, GestaltTextComposer gestaltTextComposer) {
        super(4);
        this.f130563i = i13;
        this.f130564j = gestaltTextComposer;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        GestaltTextComposer gestaltTextComposer = this.f130564j;
        int i13 = this.f130563i;
        switch (i13) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                int intValue3 = ((Number) obj4).intValue();
                switch (i13) {
                    case 0:
                        return new y(gestaltTextComposer.getId(), intValue, intValue2, intValue3, String.valueOf(charSequence));
                    default:
                        return new o(gestaltTextComposer.getId(), intValue, String.valueOf(charSequence), intValue2, intValue3);
                }
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue4 = ((Number) obj2).intValue();
                int intValue5 = ((Number) obj3).intValue();
                int intValue6 = ((Number) obj4).intValue();
                switch (i13) {
                    case 0:
                        return new y(gestaltTextComposer.getId(), intValue4, intValue5, intValue6, String.valueOf(charSequence2));
                    default:
                        return new o(gestaltTextComposer.getId(), intValue4, String.valueOf(charSequence2), intValue5, intValue6);
                }
        }
    }
}
