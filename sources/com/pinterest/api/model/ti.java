package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0012¢\u0006\u0004\b\u0015\u0010\u0016B'\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u0019R(\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\"\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b8\u0002@BX\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b8\u0002@BX\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/pinterest/api/model/ti;", "", "Lcom/pinterest/api/model/li;", "<set-?>", "a", "Lcom/pinterest/api/model/li;", "()Lcom/pinterest/api/model/li;", "ideaPinDisplayOptions", "", "b", "Ljava/lang/Integer;", "_quickSaveIcon", "c", "_pinRounding", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setShowSavedOverlay", "(Ljava/lang/Boolean;)V", "showSavedOverlay", "<init>", "()V", "quickSaveIcon", "pinRounding", "(Lcom/pinterest/api/model/li;Ljava/lang/Integer;Ljava/lang/Integer;)V", "com/pinterest/api/model/si", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ti {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("idea_pin_display_options")
    private li ideaPinDisplayOptions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("quick_save_icon")
    private Integer _quickSaveIcon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("pin_rounding")
    private Integer _pinRounding;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("show_saved_overlay")
    private Boolean showSavedOverlay;

    static {
        new si(null);
    }

    private ti() {
    }

    public ti(li liVar, Integer num, Integer num2) {
        this.ideaPinDisplayOptions = liVar;
        this._quickSaveIcon = num;
        this._pinRounding = num2;
    }

    /* renamed from: a, reason: from getter */
    public final li getIdeaPinDisplayOptions() {
        return this.ideaPinDisplayOptions;
    }

    public final z32.z1 b() {
        Integer num = this._pinRounding;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        z32.z1.Companion.getClass();
        if (intValue == 0) {
            return z32.z1.NONE;
        }
        if (intValue != 1) {
            return null;
        }
        return z32.z1.SMALL;
    }

    public final z32.f2 c() {
        Integer num = this._quickSaveIcon;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        z32.f2.Companion.getClass();
        return z32.d2.a(intValue);
    }

    /* renamed from: d, reason: from getter */
    public final Boolean getShowSavedOverlay() {
        return this.showSavedOverlay;
    }
}
