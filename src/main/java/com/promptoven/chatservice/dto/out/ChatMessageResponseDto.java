package com.promptoven.chatservice.dto.out;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class ChatMessageResponseDto {

    private String id;
    private String roomId;
    private String messageType;
    private String message;
    private String senderUuid;
    private Boolean isRead;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder
    public ChatMessageResponseDto(String id, String roomId, String messageType, String message, String senderUuid, Boolean isRead,
            LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.roomId = roomId;
        this.messageType = messageType;
        this.message = message;
        this.senderUuid = senderUuid;
        this.isRead = isRead;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
