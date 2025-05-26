package com.pinterest.api.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/pinterest/api/model/pp;", "Ldl1/s;", "", "a", "I", "()I", "interactiveStickerType", "<init>", "(I)V", "com/pinterest/api/model/op", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class pp implements dl1.s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("interactive_sticker_type")
    private final int interactiveStickerType;

    static {
        new op(null);
    }

    public pp(int i13) {
        this.interactiveStickerType = i13;
    }

    /* renamed from: a, reason: from getter */
    public final int getInteractiveStickerType() {
        return this.interactiveStickerType;
    }

    @Override // dl1.s
    public final String b() {
        return String.valueOf(this.interactiveStickerType);
    }
}
