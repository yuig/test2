package zd0;

import ae0.f;
import gf2.w;
import hf2.q;
import ja.d0;
import ja.i;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import xa0.j;

/* loaded from: classes5.dex */
public final class a extends i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f141660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f141661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, d0 d0Var, int i13) {
        super(d0Var, 1);
        this.f141660d = i13;
        this.f141661e = obj;
    }

    @Override // androidx.recyclerview.widget.c3
    public final String e() {
        switch (this.f141660d) {
            case 0:
                return "INSERT OR REPLACE INTO `idea_pin_font` (`id`,`key`,`type`,`lineHeight`,`name`,`path`) VALUES (?,?,?,?,?,?)";
            case 1:
                return "INSERT OR ABORT INTO `idea_pin_recently_used_content` (`content_id`,`user_id`,`last_used_timestamp`,`content_type`) VALUES (?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `network_speed` (`ideaPinPageId`,`uploadBucket`,`bytesWritten`,`timestamp`,`networkType`,`status`,`ideaPinCreationId`,`isVideo`) VALUES (?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR ABORT INTO `collage_drafts` (`id`,`user_id`,`last_updated_at`) VALUES (?,?,?)";
            case 4:
                return "INSERT OR ABORT INTO `collage_page` (`id`,`draft_id`,`background_image`) VALUES (?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `MqMessageEntity` (`messageId`,`clientHandle`,`topic`,`mqttMessage`,`qos`,`retained`,`duplicate`,`timestamp`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    @Override // ja.i
    public final void l(oa.i iVar, Object obj) {
        String key;
        int i13 = this.f141660d;
        Object obj2 = this.f141661e;
        switch (i13) {
            case 0:
                e eVar = (e) obj;
                iVar.c1(1, eVar.f141672a);
                iVar.c1(2, eVar.f141673b);
                ((d) obj2).f141668c.getClass();
                iVar.u1(3, j.f(eVar.f141674c));
                iVar.N(4, eVar.f141675d);
                iVar.c1(5, eVar.f141676e);
                iVar.c1(6, eVar.f141677f);
                break;
            case 1:
                f fVar = (f) obj;
                iVar.c1(1, fVar.f15049a);
                iVar.c1(2, fVar.f15050b);
                iVar.u1(3, fVar.f15051c);
                ((ae0.e) obj2).f15046c.getClass();
                iVar.c1(4, j.e(fVar.f15052d));
                break;
            case 2:
                ce0.b bVar = (ce0.b) obj;
                iVar.c1(1, bVar.f27591a);
                ce0.a aVar = (ce0.a) obj2;
                aVar.f27586c.getClass();
                ex0.e eVar2 = bVar.f27592b;
                if (eVar2 == null || (key = eVar2.getKey()) == null) {
                    key = ex0.e.UNKNOWN.getKey();
                }
                if (key == null) {
                    iVar.M1(2);
                } else {
                    iVar.c1(2, key);
                }
                Long l13 = bVar.f27593c;
                if (l13 == null) {
                    iVar.M1(3);
                } else {
                    iVar.u1(3, l13.longValue());
                }
                iVar.u1(4, bVar.f27594d);
                aVar.f27587d.getClass();
                iVar.c1(5, j.h(bVar.f27595e));
                aVar.f27588e.getClass();
                iVar.c1(6, j.o(bVar.f27596f));
                iVar.c1(7, bVar.f27597g);
                iVar.u1(8, bVar.f27598h ? 1L : 0L);
                break;
            case 3:
                x71.a aVar2 = (x71.a) obj;
                iVar.c1(1, aVar2.f134111a);
                iVar.c1(2, aVar2.f134112b);
                w71.d.a((w71.d) obj2).getClass();
                Date date = aVar2.f134113c;
                Long valueOf = date != null ? Long.valueOf(date.getTime()) : null;
                if (valueOf != null) {
                    iVar.u1(3, valueOf.longValue());
                    break;
                } else {
                    iVar.M1(3);
                    break;
                }
            case 4:
                x71.c cVar = (x71.c) obj;
                iVar.c1(1, cVar.f134117a);
                iVar.c1(2, cVar.f134118b);
                String a13 = w71.i.a((w71.i) obj2).a(cVar.f134119c);
                if (a13 != null) {
                    iVar.c1(3, a13);
                    break;
                } else {
                    iVar.M1(3);
                    break;
                }
            default:
                kf2.a aVar3 = (kf2.a) obj;
                iVar.c1(1, aVar3.f79356a);
                iVar.c1(2, aVar3.f79357b);
                iVar.c1(3, aVar3.f79358c);
                jf2.c cVar2 = (jf2.c) obj2;
                w wVar = (w) cVar2.f75874c;
                mp2.i value = aVar3.f79359d;
                wVar.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                byte[] bArr = value.f87941a;
                Intrinsics.checkNotNullExpressionValue(bArr, "getPayload(...)");
                iVar.c1(4, new String(bArr, Charsets.UTF_8));
                ((w) cVar2.f75874c).getClass();
                q value2 = aVar3.f79360e;
                Intrinsics.checkNotNullParameter(value2, "value");
                iVar.u1(5, value2.getValue());
                iVar.u1(6, aVar3.f79361f ? 1L : 0L);
                iVar.u1(7, aVar3.f79362g ? 1L : 0L);
                iVar.u1(8, aVar3.f79363h);
                break;
        }
    }
}
