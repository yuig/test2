package zm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public abstract class d implements b0 {
    static {
        int i13 = k.f142232b;
    }

    public final c b(ByteArrayInputStream byteArrayInputStream, k kVar) {
        t tVar;
        try {
            int read = byteArrayInputStream.read();
            if (read == -1) {
                tVar = null;
            } else {
                if ((read & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
                    read &= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
                    int i13 = 7;
                    while (true) {
                        if (i13 >= 32) {
                            while (i13 < 64) {
                                int read2 = byteArrayInputStream.read();
                                if (read2 == -1) {
                                    throw InvalidProtocolBufferException.g();
                                }
                                if ((read2 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
                                    i13 += 7;
                                }
                            }
                            throw InvalidProtocolBufferException.c();
                        }
                        int read3 = byteArrayInputStream.read();
                        if (read3 == -1) {
                            throw InvalidProtocolBufferException.g();
                        }
                        read |= (read3 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) << i13;
                        if ((read3 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
                            break;
                        }
                        i13 += 7;
                    }
                }
                h hVar = new h(new a(read, byteArrayInputStream));
                t a13 = a(hVar, kVar);
                try {
                    if (hVar.f142213f != 0) {
                        throw InvalidProtocolBufferException.a();
                    }
                    tVar = a13;
                } catch (InvalidProtocolBufferException e13) {
                    e13.f80460a = a13;
                    throw e13;
                }
            }
            if (tVar == null || tVar.isInitialized()) {
                return tVar;
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.f80460a = tVar;
            throw invalidProtocolBufferException;
        } catch (IOException e14) {
            throw new InvalidProtocolBufferException(e14.getMessage());
        }
    }
}
