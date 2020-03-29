docker:
	./gradlew clean build
	docker build --build-arg JAR_FILE=build/libs/*.jar -t marcat/vantage .
