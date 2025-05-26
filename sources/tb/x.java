package tb;

import ja.d0;
import kb.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends ja.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f117048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f117049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, d0 d0Var, int i13) {
        super(d0Var, 0);
        this.f117048d = i13;
        this.f117049e = obj;
    }

    @Override // androidx.recyclerview.widget.c3
    public final String e() {
        switch (this.f117048d) {
            case 0:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `idea_pin_drafts` SET `id` = ?,`user_id` = ?,`metadata` = ?,`page_data` = ?,`tags` = ?,`board_id` = ?,`board_section_id` = ?,`comment_reply_data` = ?,`comments_enabled` = ?,`text_style_block_id` = ?,`extracted_image_metadata` = ?,`is_broken` = ?,`cover_image_path` = ?,`page_count` = ?,`duration` = ?,`last_updated_at` = ?,`exported_media` = ?,`link` = ?,`created_at` = ?,`is_expiration_supported` = ?,`scheduled_date` = ? WHERE `id` = ?";
        }
    }

    @Override // ja.i
    public final void l(oa.i iVar, Object obj) {
        int i13;
        int i14 = 1;
        switch (this.f117048d) {
            case 0:
                s sVar = (s) obj;
                iVar.c1(1, sVar.f117016a);
                iVar.u1(2, dl2.b.L2(sVar.f117017b));
                iVar.c1(3, sVar.f117018c);
                iVar.c1(4, sVar.f117019d);
                kb.l lVar = sVar.f117020e;
                kb.l lVar2 = kb.l.f79018b;
                iVar.y1(5, bk.f.e0(lVar));
                iVar.y1(6, bk.f.e0(sVar.f117021f));
                iVar.u1(7, sVar.f117022g);
                iVar.u1(8, sVar.f117023h);
                iVar.u1(9, sVar.f117024i);
                iVar.u1(10, sVar.f117026k);
                kb.a backoffPolicy = sVar.f117027l;
                Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
                int i15 = b0.f116956b[backoffPolicy.ordinal()];
                if (i15 == 1) {
                    i13 = 0;
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i13 = 1;
                }
                iVar.u1(11, i13);
                iVar.u1(12, sVar.f117028m);
                iVar.u1(13, sVar.f117029n);
                iVar.u1(14, sVar.f117030o);
                iVar.u1(15, sVar.f117031p);
                iVar.u1(16, sVar.f117032q ? 1L : 0L);
                l0 policy = sVar.f117033r;
                Intrinsics.checkNotNullParameter(policy, "policy");
                int i16 = b0.f116958d[policy.ordinal()];
                if (i16 == 1) {
                    i14 = 0;
                } else if (i16 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar.u1(17, i14);
                iVar.u1(18, sVar.f117034s);
                iVar.u1(19, sVar.f117035t);
                iVar.u1(20, sVar.f117036u);
                iVar.u1(21, sVar.f117037v);
                iVar.u1(22, sVar.f117038w);
                String str = sVar.f117039x;
                if (str == null) {
                    iVar.M1(23);
                } else {
                    iVar.c1(23, str);
                }
                kb.g gVar = sVar.f117025j;
                iVar.u1(24, dl2.b.d2(gVar.f78989a));
                iVar.y1(25, dl2.b.p0(gVar.f78990b));
                iVar.u1(26, gVar.f78991c ? 1L : 0L);
                iVar.u1(27, gVar.f78992d ? 1L : 0L);
                iVar.u1(28, gVar.f78993e ? 1L : 0L);
                iVar.u1(29, gVar.f78994f ? 1L : 0L);
                iVar.u1(30, gVar.f78995g);
                iVar.u1(31, gVar.f78996h);
                iVar.y1(32, dl2.b.z2(gVar.f78997i));
                iVar.c1(33, sVar.f117016a);
                return;
            default:
                yd0.a aVar = (yd0.a) obj;
                iVar.c1(1, aVar.f138752a);
                iVar.c1(2, aVar.f138753b);
                xd0.f fVar = (xd0.f) this.f117049e;
                String k13 = ((nm.o) xd0.f.a(fVar).f134620b.getValue()).k(aVar.f138754c);
                if (k13 == null) {
                    iVar.M1(3);
                } else {
                    iVar.c1(3, k13);
                }
                String k14 = ((nm.o) xd0.f.a(fVar).f134620b.getValue()).k(aVar.f138755d);
                if (k14 == null) {
                    iVar.M1(4);
                } else {
                    iVar.c1(4, k14);
                }
                String k15 = ((nm.o) xd0.f.a(fVar).f134620b.getValue()).k(aVar.f138756e);
                if (k15 == null) {
                    iVar.M1(5);
                } else {
                    iVar.c1(5, k15);
                }
                String str2 = aVar.f138757f;
                if (str2 == null) {
                    iVar.M1(6);
                } else {
                    iVar.c1(6, str2);
                }
                String str3 = aVar.f138758g;
                if (str3 == null) {
                    iVar.M1(7);
                } else {
                    iVar.c1(7, str3);
                }
                String k16 = ((nm.o) xd0.f.a(fVar).f134620b.getValue()).k(null);
                if (k16 == null) {
                    iVar.M1(8);
                } else {
                    iVar.c1(8, k16);
                }
                iVar.u1(9, aVar.f138759h ? 1L : 0L);
                String str4 = aVar.f138760i;
                if (str4 == null) {
                    iVar.M1(10);
                } else {
                    iVar.c1(10, str4);
                }
                byte[] bArr = aVar.f138761j;
                if (bArr == null) {
                    iVar.M1(11);
                } else {
                    iVar.y1(11, bArr);
                }
                iVar.u1(12, aVar.f138762k ? 1L : 0L);
                String str5 = aVar.f138763l;
                if (str5 == null) {
                    iVar.M1(13);
                } else {
                    iVar.c1(13, str5);
                }
                iVar.u1(14, aVar.f138764m);
                iVar.u1(15, aVar.f138765n);
                xd0.f.a(fVar).getClass();
                Long a13 = xd0.h.a(aVar.f138766o);
                if (a13 == null) {
                    iVar.M1(16);
                } else {
                    iVar.u1(16, a13.longValue());
                }
                String k17 = ((nm.o) xd0.f.a(fVar).f134620b.getValue()).k(aVar.f138767p);
                if (k17 == null) {
                    iVar.M1(17);
                } else {
                    iVar.c1(17, k17);
                }
                String str6 = aVar.f138768q;
                if (str6 == null) {
                    iVar.M1(18);
                } else {
                    iVar.c1(18, str6);
                }
                xd0.f.a(fVar).getClass();
                Long a14 = xd0.h.a(aVar.f138769r);
                if (a14 == null) {
                    iVar.M1(19);
                } else {
                    iVar.u1(19, a14.longValue());
                }
                iVar.u1(20, aVar.f138770s ? 1L : 0L);
                xd0.f.a(fVar).getClass();
                Long a15 = xd0.h.a(aVar.f138771t);
                if (a15 == null) {
                    iVar.M1(21);
                } else {
                    iVar.u1(21, a15.longValue());
                }
                iVar.c1(22, aVar.f138752a);
                return;
        }
    }
}
