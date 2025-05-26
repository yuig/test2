package jf2;

import gf2.w;
import hf2.q;
import ja.d0;
import ja.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class a extends i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f75869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f75870e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, d0 d0Var, int i13) {
        super(d0Var, 0);
        this.f75869d = i13;
        this.f75870e = cVar;
    }

    @Override // androidx.recyclerview.widget.c3
    public final String e() {
        switch (this.f75869d) {
            case 0:
                return "DELETE FROM `MqMessageEntity` WHERE `messageId` = ?";
            default:
                return "UPDATE OR ABORT `MqMessageEntity` SET `messageId` = ?,`clientHandle` = ?,`topic` = ?,`mqttMessage` = ?,`qos` = ?,`retained` = ?,`duplicate` = ?,`timestamp` = ? WHERE `messageId` = ?";
        }
    }

    @Override // ja.i
    public final /* bridge */ /* synthetic */ void l(oa.i iVar, Object obj) {
        switch (this.f75869d) {
            case 0:
                p(iVar, (kf2.a) obj);
                break;
            default:
                p(iVar, (kf2.a) obj);
                break;
        }
    }

    public final void p(oa.i iVar, kf2.a aVar) {
        switch (this.f75869d) {
            case 0:
                iVar.c1(1, aVar.f79356a);
                break;
            default:
                iVar.c1(1, aVar.f79356a);
                iVar.c1(2, aVar.f79357b);
                iVar.c1(3, aVar.f79358c);
                c cVar = this.f75870e;
                w wVar = (w) cVar.f75874c;
                mp2.i value = aVar.f79359d;
                wVar.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                byte[] bArr = value.f87941a;
                Intrinsics.checkNotNullExpressionValue(bArr, "getPayload(...)");
                iVar.c1(4, new String(bArr, Charsets.UTF_8));
                ((w) cVar.f75874c).getClass();
                q value2 = aVar.f79360e;
                Intrinsics.checkNotNullParameter(value2, "value");
                iVar.u1(5, value2.getValue());
                iVar.u1(6, aVar.f79361f ? 1L : 0L);
                iVar.u1(7, aVar.f79362g ? 1L : 0L);
                iVar.u1(8, aVar.f79363h);
                iVar.c1(9, aVar.f79356a);
                break;
        }
    }
}
