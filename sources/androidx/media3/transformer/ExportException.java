package androidx.media3.transformer;

import pk.q0;

/* loaded from: classes3.dex */
public final class ExportException extends Exception {
    static {
        q0 q0Var = new q0(2, 0);
        q0Var.n("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001);
        q0Var.n("ERROR_CODE_IO_UNSPECIFIED", 2000);
        q0Var.n("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001);
        q0Var.n("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002);
        q0Var.n("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003);
        q0Var.n("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004);
        q0Var.n("ERROR_CODE_IO_FILE_NOT_FOUND", 2005);
        q0Var.n("ERROR_CODE_IO_NO_PERMISSION", 2006);
        q0Var.n("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007);
        q0Var.n("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008);
        q0Var.n("ERROR_CODE_DECODER_INIT_FAILED", 3001);
        q0Var.n("ERROR_CODE_DECODING_FAILED", 3002);
        q0Var.n("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003);
        q0Var.n("ERROR_CODE_ENCODER_INIT_FAILED", 4001);
        q0Var.n("ERROR_CODE_ENCODING_FAILED", 4002);
        q0Var.n("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003);
        q0Var.n("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001);
        q0Var.n("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001);
        q0Var.n("ERROR_CODE_MUXING_FAILED", 7001);
        q0Var.n("ERROR_CODE_MUXING_TIMEOUT", 7002);
        q0Var.n("ERROR_CODE_MUXING_APPEND", 7003);
        q0Var.a();
    }
}
