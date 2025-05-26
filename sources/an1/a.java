package an1;

import android.content.res.TypedArray;
import com.pinterest.gestalt.radioGroup.GestaltRadio;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import we1.a2;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15696i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltRadio f15697j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltRadio gestaltRadio, int i13) {
        super(1);
        this.f15696i = i13;
        this.f15697j = gestaltRadio;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f15696i;
        GestaltRadio gestaltRadio = this.f15697j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                fm1.c cVar = GestaltRadio.f49479f;
                gestaltRadio.getClass();
                return new b($receiver.getBoolean(bn1.d.GestaltRadio_android_enabled, true), $receiver.getBoolean(bn1.d.GestaltRadio_android_checked, false), d7.b.Y($receiver, bn1.d.GestaltRadio_android_visibility, GestaltRadio.f49479f), gestaltRadio.getId());
            case 1:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar2 = GestaltRadio.f49479f;
                gestaltRadio.getClass();
                a aVar = new a(gestaltRadio, 6);
                gestaltRadio.f49480e.a(im1.l.f72657j, aVar);
                gestaltRadio.setOnClickListener(new a2(gestaltRadio, 24));
                return Unit.f80348a;
            case 2:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 2:
                        gestaltRadio.setId(intValue);
                        break;
                    default:
                        gestaltRadio.setVisibility(intValue);
                        gestaltRadio.setVisibility(intValue);
                        break;
                }
                return Unit.f80348a;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 3:
                        gestaltRadio.setEnabled(booleanValue);
                        break;
                    default:
                        gestaltRadio.setChecked(booleanValue);
                        gestaltRadio.jumpDrawablesToCurrentState();
                        break;
                }
                return Unit.f80348a;
            case 4:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 3:
                        gestaltRadio.setEnabled(booleanValue2);
                        break;
                    default:
                        gestaltRadio.setChecked(booleanValue2);
                        gestaltRadio.jumpDrawablesToCurrentState();
                        break;
                }
                return Unit.f80348a;
            case 5:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 2:
                        gestaltRadio.setId(intValue2);
                        break;
                    default:
                        gestaltRadio.setVisibility(intValue2);
                        gestaltRadio.setVisibility(intValue2);
                        break;
                }
                return Unit.f80348a;
            default:
                Unit it2 = (Unit) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new j(gestaltRadio.getId(), gestaltRadio.isChecked());
        }
    }
}
