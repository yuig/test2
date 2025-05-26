package og;

import yl.c;

/* loaded from: classes3.dex */
public enum a implements c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    private final int number_;

    a(int i13) {
        this.number_ = i13;
    }

    @Override // yl.c
    public int getNumber() {
        return this.number_;
    }
}
